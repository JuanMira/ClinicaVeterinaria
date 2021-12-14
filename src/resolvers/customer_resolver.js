const customerResolver = {
  Query: {
    listCustomer: (_, __, { dataSources }) =>
      dataSources.customerAPI.listCustomer(),
    customerByidUsuario: async (_, { idUsuario }, { dataSources }) => {
      console.log(idUsuario);
      return await dataSources.customerAPI.customerByidUsuario(idUsuario);
    },
  },
  Mutation: {
    createCusto: async (_, { Customer }, { dataSources }) => {
      const customerInput = {
        idUsuario: Customer.idUsuario,
        firstName: Customer.firstName,
        lastName: Customer.lastName,
        correo: Customer.correo,
        telefono: Customer.telefono,
        tipoDocumento: Customer.tipoDocumento,
        direccion: Customer.direccion,
        lastChange: new Date().toISOString(),
      };
      await dataSources.customerAPI.createCustomer(customerInput);
    },
  },
};
module.exports = customerResolver;
