module.exports = {
  preset: "jest-preset-angular",
  setupFilesAfterEnv: ["<rootDir>/jest.config.ts"],
  testPathIgnorePatterns: [
    "<rootDir>/node_modules/",
    "<rootDir>/dist/",
    "<rootDir>/src/test.ts",
  ],
  globals: {
    "ts-jest": {
      tsConfig: "<rootDir>/tsconfig.spec.json",
      stringifyContentPathRegex: "\\.html$",
    },
  },
  collectCoverageFrom: [
    "**/*.component.ts",
    "**/*.service.ts",
    "**/*.effect.ts",
    "**/*.reducer.ts",
    "**/*.action.ts",
    "**/*.selector.ts",
    "!**/node_modules/**",
    "!**/vendor/**",
    "!**/tabla-anuncios.component.ts",
    "!**/requeridos-contenedor.component.ts",
    "!**/capacidad-vehicular-embalse.component.ts"
  ]
};
