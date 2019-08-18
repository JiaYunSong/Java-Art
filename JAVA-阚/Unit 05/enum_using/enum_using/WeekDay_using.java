package enum_using;

import enum_using.enum_func.WeekDay;

public class WeekDay_using {
	public static void main(String[] args) {
		for(WeekDay e:WeekDay.values())
			e.show();
	}
}
