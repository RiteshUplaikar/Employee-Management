document.addEventListener("DOMContentLoaded", function () {
    (function () {
        const nameInput = document.getElementById('name');
        const description = document.getElementById('description');
        const dueDateInput = document.getElementById('dueDate');
        const progressSelect = document.getElementById('progress');
        const taskDetailsInput = document.getElementById('details');
        const addTaskButton = document.getElementById('addTask');
        const editTaskButton = ducument.getElementById('edit');
        const taskTable = document.getElementById('taskTable');

        if (taskTable) {
            var taskTableBody = taskTable.querySelector('tbody'); // Use 'let' or 'var' to declare it properly
            if (taskTableBody) {
                console.log("tbody found!");
            } else {
                console.error("Error: tbody not found inside #taskTable.");
            }
        } else {
            console.error("Error: #taskTable not found.");
            return;
        }

        let tasks = [];

        function renderTasks() {
            taskTableBody.innerHTML = '';
            tasks.forEach((task, index) => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${task.name}</td>
                    <td>${task.description}</td>
                    <td>${new Date().toLocaleDateString()}</td>
                    <td>${task.dueDate}</td>
                    <td>${task.progress}</td>
                    <td>${task.details}</td>
                    <td class="actions">
                        <button class="edit" data-index="${index}">Edit</button>
                        <button class="delete" data-index="${index}">Delete</button>
                    </td>
                `;
                taskTableBody.appendChild(row);

                row.querySelector('.delete').addEventListener('click', () => {
                    deleteTask(index);
                });

                row.querySelector('.edit').addEventListener('click', () => {
                    editTask(index);
                });
            });
        }

        function addTask() {
            const name = nameInput.value.trim();
            const taskDescription = description.value.trim();
            const dueDate = dueDateInput.value;
            const progress = progressSelect.value;
            const taskDetails = taskDetailsInput.value.trim();

            if (name === '' || description === '' || dueDate === '') {
                alert('Please fill in all fields.');
                return;
            }

            tasks.push({
                name,
                taskDescription,
                dueDate,
                progress,
                taskDetails
            });

            nameInput.value = '';
            description.value = '';
            dueDateInput.value = '';
            progressSelect.value = 'To Do';
            taskDetailsInput.value = '';

            renderTasks();
        }

        function deleteTask(index) {
            tasks.splice(index, 1);
            renderTasks();
        }

        function editTask(task) {
            console.log("edit is click !!!...x`")
            nameInput.value = task.name;
            description.value = task.description;
            dueDateInput.value = task.dueDate;
            progressSelect.value = task.progress;
            taskDetailsInput.value = task.deatils;

            tasks.splice(index, 1);
            renderTasks();
        }

        addTaskButton.addEventListener('click', addTask);
        editTaskButton.addEventListener('click', editTask)

        renderTasks();
    })();
});

document.addEventListener("DOMContentLoaded", function () {
    document.querySelectorAll('.edit').forEach(button => {
        button.addEventListener('click', function () {
            // Get task data from button attributes
            const taskId = this.getAttribute('data-id');
            const taskName = this.getAttribute('data-name');
            const taskDescription = this.getAttribute('data-description');
            const assignDate = this.getAttribute('data-assign-date');
            const dueDate = this.getAttribute('data-due-date');
            const progress = this.getAttribute('data-progress');
            const details = this.getAttribute('data-details');

            // Populate modal fields (assuming you have a modal for editing)
//            document.getElementById('edit-task-id').value = taskId;
            document.getElementById('name').value = taskName;
            document.getElementById('description').value = taskDescription;
            document.getElementById('assign-date').value = assignDate;
            document.getElementById('due-date').value = dueDate;
            document.getElementById('progress').value = progress;
            document.getElementById('details').value = details;

            // Show the modal
            document.getElementById('editTaskModal').style.display = 'block';
        });
    });
});

