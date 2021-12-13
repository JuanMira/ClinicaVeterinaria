const { gql } = require("apollo-server");
const authTypeDefs = gql`
  type Tokens {
    refresh: String!
    access: String!
  }
  type Access {
    access: String!
  }
  input CredentialsInput {
    username: String!
    password: String!
  }
  input SignUpInput {
    username: String!
    nombres: String!
    apellidos: String!
    especialidad: String!
    email: String!
    telefono: Int!
    password: String!
  }
  type UserDetail {
    id: Int!
    username: String!
    nombres: String!
    apellidos: String!
    especialidad: String!
    email: String!
    telefono: Int!
    password: String!
  }
  type Mutation {
    signUpUser(userInput: SignUpInput): Tokens!
    logIn(credentials: CredentialsInput!): Tokens!
    refreshToken(refresh: String!): Access!
  }
  type Query {
    userDetailById(userId: Int!): UserDetail!
  }
`;
module.exports = authTypeDefs;
