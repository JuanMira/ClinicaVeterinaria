const { gql } = require("apollo-server");
const petsTypeDefs = gql`
  type Pets {
    idMascota: String
    nombreMascota: String
    raza: String
    idCustomer: String
  }
  input signUpPets {
    idMascota: String
    nombreMascota: String
    raza: String
    idCustomer: String
  }

  type Mutation {
    createPets(Customer: signUpPets!): Pets
    deletePets(idMascota: String!): Boolean
    adoptPet(idMascota: String!, idCustomer: String!): Boolean
    updatePet(idPet: String!, Customer: signUpPets!): Boolean
  }
  extend type Query {
    petsByidMascota(idMascota: String!): Pets
    listPets: [Pets]
  }
`;
module.exports = petsTypeDefs;
