AI Agent with MCP Server (Java)
Overview

This project integrates AI Agent capabilities with multiple Model Context Protocol (MCP) servers using Java. It allows automated interactions with browsers, Azure DevOps, and Atlassian services from within IntelliJ IDEA or other Java environments.

Prerequisites

Java 18

IntelliJ IDEA 2025.1+ (Community or Ultimate)

Node.js 18+ and npm 8+

GitHub Copilot Pro (optional)

Authentication credentials for each MCP service

Supported MCP Servers

Selenium MCP – Browser automation (Chrome, Firefox, Edge)
Tools: start_browser, navigate, find_element, click_element, send_keys, take_screenshot, hover, drag_and_drop

Azure DevOps MCP – CI/CD and work item automation
Tools: list_projects, create_work_item, update_work_item, list_repositories, queue_build, create_pull_request


Setup
Add MCP Server Configuration

Open IntelliJ IDEA → File > Settings > Tools > AI Assistant > MCP

Click Add → Provide a JSON configuration

Paste your MCP JSON configuration (example: mcp-config.json)

Set Level: Global or Project

Click Apply

Tip: Use environment variables for sensitive credentials instead of hardcoding tokens.

Environment Variables Example
# Azure DevOps
export AZURE_DEVOPS_ORG_URL=https://dev.azure.com/your-org
export AZURE_DEVOPS_AUTH_METHOD=pat
export AZURE_DEVOPS_PAT=your-token
export AZURE_DEVOPS_DEFAULT_PROJECT=your-project

Running the AI Agent

Open AI Assistant Chat in IntelliJ

Type / to see available MCP tools

Example commands:

/start_browser chrome
/navigate https://google.com
/list_projects
/jira_search_issues assigned to me

Troubleshooting

Authentication Errors → Check tokens, permissions, and environment variables

Connection Issues → Verify network connectivity and server URLs

Browser Automation Failures → Ensure browser drivers are installed and in PATH

Best Practices

Store credentials securely using environment variables

Use least privilege principle for tokens

Clean up browser sessions and connections after use

Share MCP configuration without secrets for team collaboration

License

MIT License
