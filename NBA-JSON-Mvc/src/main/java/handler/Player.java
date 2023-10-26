package handler;

public class Player {
	private String firstName;
	private String lastName;
	private String team;
	private String position;
	private String dateOfBirth;
	private String height;
	private String weight;
	private String jerseyNumber;
	private String age;
	private String careerPoints;
	private String careerBlocks;
	private String careerAssists;
	private String careerRebounds;
	private String careerTurnovers;
	private String careerPercentageThree;
	private String careerPercentageFreethrow;
	private String careerPercentageFieldGoal;
	private String headShotUrl;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCareerPoints() {
		return careerPoints;
	}

	public void setCareerPoints(String careerPoints) {
		this.careerPoints = careerPoints;
	}

	public String getCareerBlocks() {
		return careerBlocks;
	}

	public void setCareerBlocks(String careerBlocks) {
		this.careerBlocks = careerBlocks;
	}

	public String getCareerAssists() {
		return careerAssists;
	}

	public void setCareerAssists(String careerAssists) {
		this.careerAssists = careerAssists;
	}

	public String getCareerRebounds() {
		return careerRebounds;
	}

	public void setCareerRebounds(String careerRebounds) {
		this.careerRebounds = careerRebounds;
	}

	public String getCareerTurnovers() {
		return careerTurnovers;
	}

	public void setCareerTurnovers(String careerTurnovers) {
		this.careerTurnovers = careerTurnovers;
	}

	public String getCareerPercentageThree() {
		return careerPercentageThree;
	}

	public void setCareerPercentageThree(String careerPercentageThree) {
		this.careerPercentageThree = careerPercentageThree;
	}

	public String getCareerPercentageFreethrow() {
		return careerPercentageFreethrow;
	}

	public void setCareerPercentageFreethrow(String careerPercentageFreethrow) {
		this.careerPercentageFreethrow = careerPercentageFreethrow;
	}

	public String getCareerPercentageFieldGoal() {
		return careerPercentageFieldGoal;
	}

	public void setCareerPercentageFieldGoal(String careerPercentageFieldGoal) {
		this.careerPercentageFieldGoal = careerPercentageFieldGoal;
	}

	public String getHeadShotUrl() {
		return headShotUrl;
	}

	public void setHeadShotUrl(String headShotUrl) {
		this.headShotUrl = headShotUrl;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + ", position=" + position
				+ ", dateOfBirth=" + dateOfBirth + ", height=" + height + ", weight=" + weight + ", jerseyNumber="
				+ jerseyNumber + ", age=" + age + ", careerPoints=" + careerPoints + ", careerBlocks=" + careerBlocks
				+ ", careerAssists=" + careerAssists + ", careerRebounds=" + careerRebounds + ", careerTurnovers="
				+ careerTurnovers + ", careerPercentageThree=" + careerPercentageThree + ", careerPercentageFreethrow="
				+ careerPercentageFreethrow + ", careerPercentageFieldGoal=" + careerPercentageFieldGoal
				+ ", headShotUrl=" + headShotUrl + "]";
	}
}
