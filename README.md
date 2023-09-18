
# Scenario 
We are both part of the Advance Cloud team.

We have been working together at this stock management API and last night Operations teams deployed it for the first time to production.

This morning as we were warming up for the day ahead with our coffee (or tea), we received the following email from our manager:

>Good morning,
>
>Good job deploying the API yesterday! 
>I hate to be the bearer of sad news, but I just received a call from the Operations and they are reporting some issues with the API:
>
>1. Cents / Pences are being ignored during the stock conversion to the customer wallets.
>2. Customers with Stocks of type D and E are receving more money (3 pounds) instead the real stock value.
>
>Could you please take a look into that?

We also received a email from our team lead:

>Good morning team, 
>
>I just finished the review of the API code and I have a few action items for you:
>
>1. StockToMoneyConverter implementation is not good, adding future stocks will be a major problem in the future, please improve that abstraction to be independent of the stock type.
>2. Add tests, at least around StockToMoneyConverter, to ensure the functionality is properly tested before deployment.
>3. I am not sure about the performance of StockValues.findStockValueByName when we start loading all the stocks from the database (over 20 million stock types). Could you review that class and check if there's anything we need to improve before next sprint?

Not so happy about the day ahead anymore, we start working.