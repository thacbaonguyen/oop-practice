package OOP28;

import java.time.Duration;
import java.time.LocalDateTime;

public class SinhVien implements Comparable<SinhVien>{
	private String hoTen;
	LocalDateTime start, end;
	public SinhVien(String hoTen, LocalDateTime start, LocalDateTime end) {
		super();
		this.hoTen = hoTen;
		this.start = start;
		this.end = end;
	}
	
	public LocalDateTime getStart() {
		return start;
	}
	public LocalDateTime getEnd() {
		return end;
	}

	@Override
	public String toString() {
		Duration duration = Duration.between(start, end);
		return hoTen + " " + duration.toMinutes();
	}
	@Override
	public int compareTo(SinhVien o) {
		Duration duration1 = Duration.between(start, end);
		Duration duration2 = Duration.between(o.getStart(), o.getEnd());
		return Long.compare(duration2.toMinutes(), duration1.toMinutes());
	}
}
