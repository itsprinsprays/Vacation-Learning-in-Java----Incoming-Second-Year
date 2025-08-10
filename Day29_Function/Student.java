	package Day29_Function;
	
	import java.util.List;
import java.util.function.Function;
	
	public class Student {
		
		private String name;
		private int mathScore, englishScore;
		
		Student(String name, int mathScore, int englishScore) {
			this.name = name;
			this.mathScore = mathScore;
			this.englishScore = englishScore;
		}
		
		public String getName() {
			return name;
		}
		
		public int getMathScore() {
			return mathScore;
		}
		
		public int getEnglishScore() {
			return englishScore;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}
		
		public void setEnglishScore(int englishScore) {
			this.englishScore = englishScore;
		}
		
		public static Function<Student, String> calculateGWA() {
			return s-> {
				int gwa = (s.getMathScore() + s.getEnglishScore()) / 2;
				String remarks = (gwa >= 90) ? "A" : 
								 (gwa >= 80) ? "B" :
								 (gwa >= 70) ? "C" :
								 (gwa >= 60) ? "D" : "F";
				
				return "Name : " + s.getName() + ", " + "Average : " + gwa + ", " + "Grade " + remarks;
			};
		}
		
		public static void printStudent(List<Student> list, Function<Student, String> stud) {
			for(Student p : list) {
				System.out.println(stud.apply(p));
			}
			
		}
	
	}
