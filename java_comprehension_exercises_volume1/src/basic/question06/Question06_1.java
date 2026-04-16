package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		String[] message = new String[4];

		message[0] = "こんにちは";
		message[1] = "Javaの学習中";
		message[2] = "繰り返しの演習";
		message[3] = "頑張ります。";

		int max = 4;

		for (int i = 0; i < max; i++) {
			System.out.println(message[i]);
		}

		System.out.println("繰り返しの処理が終了しました。");
	}
}
