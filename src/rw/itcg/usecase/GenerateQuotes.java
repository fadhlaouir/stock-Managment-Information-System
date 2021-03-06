package rw.itcg.usecase;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author NIYOMWUNGERI Apr 3, 2017, 9:40:57 PM
 */
@ManagedBean
@RequestScoped
public class GenerateQuotes {

	private String quotes;

	public String getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}

	public GenerateQuotes() {
		this.quotes = GenerateQuotes.getQaute();
	}

	public static String getQaute() {
		String[] array = {
				"Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do - Pele",
				"Success means doing the best we can with what we have. Success is the doing, not the getting; in the trying, not the triumph. Success is a personal standard, reaching for the highest that is in us, becoming all that we can be. ? Zig Ziglar",
				"To me, job titles don?t matter. Everyone is in sales. It?s the only way we stay in business. ? Harvey Mackay",
				"Remember that failure is an event, not a person. Yesterday ended last night. ? Zig Ziglar",
				"I have never worked a day in my life without selling. If I believe in something, I sell it, and I sell it hard. ? Est?e Lauder",
				"If you are not taking care of your customer, your competitor will. ? Bob Hooey"};
		Random rand = new Random();
		int lenngth = rand.nextInt(array.length);
		return array[lenngth];

	}
}
