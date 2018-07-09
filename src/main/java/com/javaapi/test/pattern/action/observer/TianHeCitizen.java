package com.javaapi.test.pattern.action.observer;

public class TianHeCitizen extends Citizen {

	public TianHeCitizen(Policeman pol) {
		setPolicemen();
		register(pol);
	}

	public void sendMessage(String help) {
		setHelp(help);
		for (int i = 0; i < pols.size(); i++) {
			Policeman pol = (Policeman) pols.get(i);
			// 通知警察行动
			pol.action(this);
		}
	}
}
