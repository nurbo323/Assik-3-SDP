# Adapter Pattern Example: iPhone and Fake iPhone

## Description
This project shows the **Adapter pattern** using a real iPhone and a fake iPhone.

- **Product** – interface expected by the client.
- **OriginalIphone** – real iPhone, implements Product.
- **FakeIphone** – fake iPhone with a different interface.
- **FakeIphoneAdapter** – adapter that makes FakeIphone look like Product.
- **Main** – client that works only with Product, does not know about the adapter.

---

## Project files

| File | Description |
|------|-------------|
| `Product.java` | Product interface |
| `OriginalIphone.java` | Real iPhone implementation |
| `FakeIphone.java` | Fake iPhone with a different interface |
| `FakeIphoneAdapter.java` | Adapter for the fake iPhone |
| `Main.java` | Client, shows how to use products |

---

## How to run

1. Save all files in one folder:

