package vn.iotstar.model;

import java.util.Date;

public class CardModel {
	private String cardId;
	private int userId;
	private Date buyDate;
	private int status;

	public CardModel() {
		super();
	}

	public CardModel(String cardId, int userId, Date buyDate, int status) {
		super();
		this.cardId = cardId;
		this.userId = userId;
		this.buyDate = buyDate;
		this.status = status;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
