const { gql } = require("apollo-server");
const petsTypeDefs = gql`
  type Pets {
    idMascota: String
    nombreMascota: String
    raza: String
    idDueno: String
  }
  input signUpPets {
    idMascota: String
    nombreMascota: String
    raza: String
    idDueno: String
  }

  type Mutation {
    createPets(Customer: signUpPets!): Pets
    deletePets(idMascota: String!): Boolean
  }
  extend type Query {
    petsByidMascota(idMascota: String!): Pets
    listPets: [Pets]
  }
`;
module.exports = petsTypeDefs;
