# Best Programming Language for Test Automation: the same test in three languages

One tiny Playwright test written in TypeScript, Python and Java. Each opens
Playwright's supported languages page and checks the top heading is visible.

Companion to the LintQA article: [Best Programming Language for Test Automation: 4 Real Picks](https://lintqa.com/best-programming-language-for-test-automation/).
## Tested versions

| Tool | Version |
|---|---|
| Playwright | 1.64.1 (Java artifact 1.64.0) |
| Node.js | 24.21.0 |
| Python | 3.13.14, pytest 9.2.0, pytest-playwright 0.10.0 |
| JDK / Maven | Temurin 25.0.5 / 3.10.0 |
| JUnit | 6.1.3 |
| OS | Windows 11 |

## Run it

TypeScript: `cd ts-test`, `npm install`, `npx playwright install`, `npx playwright test languages`
Python: `cd py-test`, `pip install pytest-playwright`, `python -m playwright install`, `python -m pytest`
Java: `cd java-test`, `mvn test`

The target page is Playwright's own docs, so the tests need internet access.
