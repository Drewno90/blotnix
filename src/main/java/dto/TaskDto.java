package dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

	@XmlRootElement
	public class TaskDto {

		private String name;
		
		private int id;
		
		private List<TaskDto> tasks;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<TaskDto> getTasks() {
			return tasks;
		}

		public void setTasks(List<TaskDto> tasks) {
			this.tasks = tasks;
		}
		
		
	}
