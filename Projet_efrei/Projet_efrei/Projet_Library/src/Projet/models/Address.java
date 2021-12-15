package Projet.models;

public class Address {
	private int id;
	private String address;
	private String address2;
	private String district;
	private String city;
	private String postalCode;
	private String country;

	//private Address() { }
	
	public Address(String address, String address2, String district, String city, String postalCode, String country) {
		this.setAddress(address);
		this.setAddress2(address2);
		this.setDistrict(district);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setCountry(country);
	}

	public Address(int id, String address, String address2, String district, String city, String postalCode, String country) {
		this(address, address2, district, city, postalCode, country);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + address + ", author=" + address2 + ", synopsis=" + district + ", city=" + city + ", country=" + country + "]";
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
