const { gql } = require("apollo-server");
const customerTypeDefs = gql`
  type Customer {
    idUsuario: String!
    firstName: String!
    lastName: String!
    correo: String!
    telefono: String!
    tipoDocumento: String!
    direccion: String!
    lastChange: String!
  }
  input CustomerInput {
    idUsuario: String!
    firstName: String!
    lastName: String!
    correo: String!
    telefono: String!
    tipoDocumento: String!
    direccion: String!
    lastChange: String!
  }
  extend type Mutation {
    createCustomer(Customer: CustomerInput!): Customer!
  }
  extend type Query {
    customerByidUsuario(idUsuario: String!): Customer!
  }
`;
module.exports = customerTypeDefs;
