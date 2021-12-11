package Projet.models;

public class Address {
	private int ID;
	private String ADDRESS;
	private String address2;
	private String DISTRICT;
	private String CITY;
	private String POSTAL_CODE;
	private String COUNTRY;

	//private Address() { }
	
	public Address(String address, String address2, String district, String city, String postal_code, String country) {
		this.setAddress(address);
		this.setAddress2(address2);
		this.setDistrict(district);
		this.setCity(city);
		this.setPostal_code(postal_code);
		this.setCountry(country);
	}

	public Address(int id, String address, String address2, String district, String city, String postal_code, String country) {
		this(address, address2, district, city, postal_code, country);
		this.setId(id);
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getAddress() {
		return ADDRESS;
	}

	public void setAddress(String address) {
		this.ADDRESS = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return DISTRICT;
	}

	public void setDistrict(String district) {
		this.DISTRICT = district;
	}
	
	public String getCity() {
		return CITY;
	}

	public void setCity(String city) {
		this.CITY = city;
	}
	
	public String getPostal_code() {
		return POSTAL_CODE;
	}

	public void setPostal_code(String postal_code) {
		this.POSTAL_CODE = postal_code;
	}
	
	public String getCountry() {
		return COUNTRY;
	}

	public void setCountry(String country) {
		this.COUNTRY = country;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + ID + ", title=" + ADDRESS + ", author=" + address2 + ", synopsis=" + DISTRICT + "]";
	}

//	public static class AddressBuilder {
//		
//		private final Address address = new Address();
//		
//		public AddressBuilder(String address,  String city, String postal_code, String country) {
//			
//		}
//		
//		public AddressBuilder setAddress2(String address2) {
//			this.address.address2 = address2;
//			return this;
//		}
//		
//		public AddressBuilder setPostal_code(String postal_code) {
//			this.address.POSTAL_CODE = postal_code;
//			return this;
//		}		
//		
//		public Address build() {
//			return address;
//		} 
//	
//	}
	
}
