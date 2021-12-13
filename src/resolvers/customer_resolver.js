const customerResolver = {
  Query: {
    customerByidUsuario: async (
      _,
      { idUsuario },
      { dataSources, userIdToken }
    ) => {
      usernameToken = (await dataSources.authAPI.getUser(userIdToken)).username;
      if (idUsuario == usernameToken)
        return await dataSources.customerAPI.customerByidUsuario(idUsuario);
      else return null;
    },
  },
  Mutation: {
    signUpUser: async (_, { userInput }, { dataSources }) => {
      const customerInput = {
        idUsuario: userInput.idUsuario,
        firstname: userInput.firstname,
        lastname: userInput.lastname,
        correo: userInput.correo,
        telefono: userInput.telefono,
        tipoDocumento: userInput.tipoDocumento,
        direccion: userInput.direccion,
        lastChange: new Date().toISOString(),
      };
      await dataSources.customerAPI.createCustomer(customerInput);
    },
  },
};
module.exports = customerResolver;
