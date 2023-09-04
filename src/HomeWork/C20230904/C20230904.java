package HomeWork.C20230904;

import java.util.ArrayList;

class ToDoList {
    private ArrayList<String> tasks;	//ArrayList로 tasks를 생성	

    public ToDoList() {
        tasks = new ArrayList<>();
    }
    // ToDoList 생성자를 만들고 tasks 를 ArrayList로 초기화
    
    
    // 할 일 추가 메서드
    public void addTask(String task) {
        tasks.add(task);
    }

    // 할 일 삭제 메서드
    public void removeTask(String task) {
        tasks.remove(task);
    }

    // 할 일 목록 표시 메서드
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("할 일이 없습니다.");
        } else {
            System.out.println("할 일 목록:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    
}


public class C20230904 {

	public static void main(String[] args) {
		
		//간단한 To-Do 리스트
		//To-Do 리스트를 관리하는 프로그램을 작성하세요. 할 일을 추가, 삭제, 목록 표시하는 메서드를 가진 클래스를 구현하세요.
		
	    
        ToDoList toDoList = new ToDoList();

        // 할 일 추가
        toDoList.addTask("코딩 공부하기");
        toDoList.addTask("운동 가기");
        toDoList.addTask("도서관 도서 반납하기");

        // 할 일 목록 표시
        toDoList.displayTasks();

        // 할 일 삭제
        toDoList.removeTask("운동 가기");

        // 업데이트된 할 일 목록 표시
        toDoList.displayTasks();
	
	}

		
		
}

