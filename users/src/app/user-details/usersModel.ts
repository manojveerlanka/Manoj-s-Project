export interface Address {
  geolocation: {
    lat: string;
    long: string;
  };

  street: string;
  suite: string;
  city: string;
  zipcode: string;
}

export interface name {
  firstname: string;
  lastname: string;
}

export interface user {
  id: number;
  name: name;
  username: string;
  email: string;
  address: Address;
  phone: string;
  __v: number;
  password: string;
}
