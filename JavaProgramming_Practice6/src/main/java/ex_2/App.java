package ex_2;

import java.util.Map;
import java.util.TreeMap;
/**
 * Практическое занятие Threads
 *
 * +++ 1. Создать поток, который бы в течение примерно 5 сек печатал свое имя
 * каждые полсекунды. Сделать это двумя способами при помощи
 * расширения класса Thread и при помощи реализации интерфейса
 *
 * +++ 2. Разработайте класс MyShedule, который содержит метод, получающий
 * Map интервалов времени в мсек и согласованный с ним сообщений, и
 * выводит соответствующие сообщения на экран через заданные интервалы
 *
 * 3. Написать программу, которая при помощи нескольких потоков сможет
 * найти все файлы с заданным названием (например все txt) в указанной
 * директории и путь к ним записать в лог файл.
 *
 * 4. Реализовать программу которая будет копировать все файлы из одной
 * папки в другую используя потоки
 */

public class App {
	public static void main(String[] args) {

		Map<Integer,String> runa = new TreeMap<Integer,String>();
			
				runa.put(1000, "Мама");
				runa.put(1100, "мыла");
				runa.put(1200, "Папу");
				runa.put(1300, "!!!!!!!");
				runa.put(1400, "тамдамдам");
		
		MyShedule ms = new MyShedule();
		ms.table(runa);
		
	}
}

