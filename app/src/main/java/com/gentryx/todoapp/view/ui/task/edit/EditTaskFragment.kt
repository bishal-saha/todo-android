package com.gentryx.todoapp.view.ui.task.edit

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.gentryx.todoapp.R
import com.gentryx.todoapp.viewmodel.task.EditTaskViewModel
import kotlinx.android.synthetic.main.edit_task_fragment.*
import kotlinx.android.synthetic.main.task_detail_fragment.*
import org.jetbrains.anko.support.v4.alert

class EditTaskFragment : Fragment() {

    companion object {
        const val TAG = "EditTaskFragment"
        fun newInstance() = EditTaskFragment()
    }

    private lateinit var viewModel: EditTaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_task_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EditTaskViewModel::class.java)
        viewModel.init(requireContext())
        resources.getStringArray(R.array.task_status_list).toCollection(viewModel.taskList)

        val args = EditTaskFragmentArgs.fromBundle(requireArguments())
        viewModel.id.value = args.taskId
        viewModel.title.value = args.taskTitle
        viewModel.body.value = args.taskBody
        viewModel.status.value = args.taskStatus

        observeData()

        fab_edit_task.setOnClickListener {
            viewModel.title.value = edit_title.text.toString()
            viewModel.body.value = edit_body.text.toString()
            viewModel.status.value = edit_spinner_task.selectedItem.toString()

            viewModel.editTask()
        }
    }

    private fun observeData() {
        viewModel.id.observe(viewLifecycleOwner, Observer {

        })
        viewModel.title.observe(viewLifecycleOwner, Observer {
            edit_title.setText(it)
        })
        viewModel.body.observe(viewLifecycleOwner, Observer {
            edit_body.setText(it)
        })
        viewModel.status.observe(viewLifecycleOwner, Observer {
            viewModel.getIndexFromTaskList()
            edit_spinner_task.setSelection(viewModel.index.value!!)
        })
        viewModel.loading.observe(viewLifecycleOwner, Observer {
            pb_edit_task.visibility = if (it) View.VISIBLE else View.GONE
        })
        viewModel.isSuccess.observe(viewLifecycleOwner, Observer {
            if (it) {
                successDialog()
            } else {
                errorDialog()
            }
        })
    }

    private fun successDialog() {
        alert {
            isCancelable = false
            title = getString(R.string.alert_success_title)
            message = getString(R.string.alert_edit_success_message)
            positiveButton("OK") {
                it.dismiss()
                findNavController().navigate(EditTaskFragmentDirections.actionEditTaskFragmentToNavigationHome())
            }
        }.show()
    }

    private fun errorDialog() {
        alert {
            isCancelable = false
            title = getString(R.string.alert_error_title)
            message = getString(R.string.alert_error_message)
            positiveButton("OK") {
                it.dismiss()
            }
        }.show()
    }

}
