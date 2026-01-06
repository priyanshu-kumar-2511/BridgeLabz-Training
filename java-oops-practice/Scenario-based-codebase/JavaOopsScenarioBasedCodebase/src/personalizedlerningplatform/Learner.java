package personalizedlerningplatform;

public class Learner extends User implements ICertifiable {
	private double progress;
	
	public Learner(String name, String email, String userId) {
		super(name, email, userId);
	}
	
	public void updateProgress(double p) {
		this.progress = p;
	}
	
	// polymorphism happen
	@Override
	public String generateCertificate(String difficulty, double score) {

	    if (difficulty.equalsIgnoreCase("Easy")) {
	        if (score >= 50) {
	            return "Foundation Certificate awarded to " + name;
	        } else {
	            return "You failed the Easy course. No certificate.";
	        }
	    }
	    else { // Hard
	        if (score >= 70) {
	            return "Professional Certificate awarded to " + name;
	        } else {
	            return "You failed the Hard course. No certificate.";
	        }
	    }
	}


}
