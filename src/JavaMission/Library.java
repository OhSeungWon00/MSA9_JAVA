package mission15;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {

		System.out.println("===============ALOHA 스터디 도서관==============");

		ArrayList<String> list = new ArrayList<String>();

		Book book = new Book("123123" + "|", "이게자바냐\t " + "|", " 감자바   |", "자바감자바\t", "| 33000");

		list.add(book.getIsbn());
		list.add(book.getTitle());
		list.add(book.getWriter());
		list.add(book.getContent());
		list.add(book.getPrice());

		for (String books : list) {
			System.out.print(books);
		}

		System.out.println();
		ArrayList<String> list2 = new ArrayList<String>();

		Book book2 = new Book("112112" + "|", "정보처리기사 " + "|", " 김휴먼   |", "국가기술자격\t", "| 45000");

		list2.add(book2.getIsbn());
		list2.add(book2.getTitle());
		list2.add(book2.getWriter());
		list2.add(book2.getContent());
		list2.add(book2.getPrice());

		for (String books : list2) {
			System.out.print(books);
		}

		System.out.println();

		ArrayList<String> list3 = new ArrayList<String>();
		Book book3 = new Book("001001" + "|", "실무DB\t " + "|", " 박디비   |", "디비디비딥\t", "| 6000");

		list3.add(book3.getIsbn());
		list3.add(book3.getTitle());
		list3.add(book3.getWriter());
		list3.add(book3.getContent());
		list3.add(book3.getPrice());

		for (String books : list3) {
			System.out.print(books);
		}

	}

}