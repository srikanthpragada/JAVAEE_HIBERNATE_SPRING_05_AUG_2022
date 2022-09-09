package compositepk;

import java.io.Serializable;


// Represents Composite Primary Key
public class ChapterId implements Serializable {
	private int bookId, chapterNo;

	public ChapterId(int bookId, int chapterNo) {
		this.bookId = bookId;
		this.chapterNo = chapterNo;
	}

	@Override
	public int hashCode() {
		return bookId + chapterNo;
	}

	@Override
	public boolean equals(Object obj) {
		ChapterId other = (ChapterId) obj;
		return bookId == other.bookId && chapterNo == other.chapterNo;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getChapterNo() {
		return chapterNo;
	}

	public void setChapterNo(int chapterNo) {
		this.chapterNo = chapterNo;
	}

}
