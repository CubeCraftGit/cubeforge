# CubeForge: CubeCraft ai16z Minecraft Agent

![image](https://github.com/user-attachments/assets/c54971cd-4927-47fe-9044-4afad06ffba6)

## Features

- Fully customizable agents
- Support for multiple AI providers, including Anthropic, DeepSeek, and OpenAI
- Extendable behavior using a custom framework or the [Eliza](https://github.com/ai16z/eliza) framework
- Compatibility with multiple languages and versions, such as C (Bedrock Edition) and Java (Java Edition)

## Usage

This application includes a backend for managing conversation logic and integrates [Eliza](https://github.com/ai16z/eliza) as the agent framework via a custom client. It uses Node.js and Java/C, with PostgreSQL as the database.

### Installation

This application was built with Node v23; using this version is recommended.

To install dependencies, any package manager can be used. We recommend [pnpm](https://pnpm.io/installation).

```bash
git clone https://github.com/CubeCraftGit/cubeforge.git
cd cubeforge
pnpm install
```

### Environment Variables

The following environment variables should be configured in an `.env` file (refer to the provided [example file](./.env.example)):

- `AGENT_PROVIDER`: Specifies the agent provider. Use `eliza` or leave it blank.
- `PROVIDER`: Choose from `anthropic` (Claude 3.5), `deepseekv3`, or `openai` (GPT4).
- `AI_API_KEY`: The API key for the chosen model.
- `SERVER_PORT`: Specifies the port for the application.
- `ENDPOINT_API_KEY`: Authentication key for incoming requests.
- `ENVIRONMENT`: Defines the environment as `development` or `production`. In development mode, certain security features are disabled for easier development. For instance, the Scalar API key in the API reference is filled in automatically.
- `POSTGRES_USER`: PostgreSQL database username.
- `POSTGRES_PASSWORD`: PostgreSQL database password.
- `POSTGRES_HOST`: PostgreSQL database host.
- `POSTGRES_PORT`: PostgreSQL database port.
- `POSTGRES_DB`: PostgreSQL database name.
- `DATABASE_URL`: Specifies the database connection URL, usually set as `"postgresql://${POSTGRES_USER}:${POSTGRES_PASSWORD}@${POSTGRES_HOST}:${POSTGRES_PORT}/${POSTGRES_DB}?schema=public"`. This URL is used by Prisma to connect to the database.

If `AGENT_PROVIDER=eliza`, refer to the [Eliza documentation](https://elizaos.github.io/eliza/docs/quickstart/#installation) for additional required environment variables.

## Running the Application

### Database Setup

The database is managed using [Prisma](https://www.prisma.io/). To start and set up the database, ensure all environment variables are configured and [Docker](https://www.docker.com/) is installed. Then run:

```bash
docker compose up -d
npx prisma db push
```

### Development Mode

```bash
npm run dev
```

This starts a development server, which automatically reloads when code changes are detected, thanks to [nodemon](https://github.com/remy/nodemon).



## Contributing

Found a bug or have a suggestion? Let us know via @CubeCraftDesign on X.
