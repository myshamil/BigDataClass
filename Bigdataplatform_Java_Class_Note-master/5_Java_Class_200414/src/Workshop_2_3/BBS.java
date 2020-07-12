/*
 * 다음은 인터넷 게시판의 게시글을 표현하는 클래스이다.
 * public class BBSItem {int seqNo; //일련번호 필드
 * String writer; //작성자 필드String writtenDate;//작성일자 필드
 * String title;//제목필드
 * String content;//내용필드
 * BBSItem(int seqNo, String writer, String writtenDate, String title, String content){//생성자
 * this.seqNo=seqNo;
 * this.writer=writer;
 * this.writtenDate=writtenDate;
 * this.title=title;
 * this.content=content;}
 * }
 * 일련번호에 해당하는seqNo 필드의 값을 생성자 파라미터로 받는 것이 아니라,
 * 새로운 객체가 생성될 때마다자동으로 붙여지게 하려고 한다. 
 * 처음으로 생성되는 BBSItem객체에는1, 두번째로 생성되는 BBSItem 객체에는2, 
 * 이런 식으로 일련번호가 붙여지도록 이 클래스르 수정하여라.
 */

package Workshop_2_3;

class BBSItem{
	static int seqNo = 0;
	String writer;
	String writtenDate;
	String title;
	String content;
	
	public BBSItem(int seqNo, String writer, String writtenDate, String title, String content){
		this.seqNo = seqNo + 1;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
	}
}


public class BBS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBSItem bi_1 = new BBSItem(BBSItem.seqNo,"Theo", "2020-04-01", "Title", "Content");
		System.out.println(BBSItem.seqNo);
		
		BBSItem bi_2 = new BBSItem(BBSItem.seqNo,"Theo", "2020-04-01", "Title", "Content");
		System.out.println(BBSItem.seqNo);

	}

}
