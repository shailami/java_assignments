public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSstem;
	private double price;

	protected CellPhone(String company, String model, String description,
			String operatingSstem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSstem = operatingSstem;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSstem="
				+ operatingSstem + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatingSstem == null) ? 0 : operatingSstem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSstem == null) {
			if (other.operatingSstem != null)
				return false;
		} else if (!operatingSstem.equals(other.operatingSstem))
			return false;
		return true;
	}

}
