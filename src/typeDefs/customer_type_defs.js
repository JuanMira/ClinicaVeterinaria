const { gql } = require("apollo-server");
const customerTypeDefs = gql`
  type Customer {
    idUsuario: String
    firstName: String
    lastName: String
    correo: String
    telefono: String
    tipoDocumento: String
    direccion: String
    lastChange: String
  }
  input signUpCustomer {
    idUsuario: String
    firstName: String
    lastName: String
    correo: String
    telefono: String
    tipoDocumento: String
    direccion: String
    lastChange: String
  }
  type Mutation {
    createCusto(Customer: signUpCustomer!): Customer
  }
  extend type Query {
    customerByidUsuario(idUsuario: String!): Customer
    listCustomer: [Customer]
  }
`;
module.exports = customerTypeDefs;
