package co.khj.bean;

public class BoardBean {
	private int bid;	// 글번호
	private String btitle;	//글제목
	private String bcontent;	//글내용
	private String bname;	//작성자
	private int bcnt;	//조회수
	private String bdate;	//작성일

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBcnt() {
		return bcnt;
	}

	public void setBcnt(int bcnt) {
		this.bcnt = bcnt;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

}
