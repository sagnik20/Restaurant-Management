import { Customer } from "./customer";
import { Item } from "./item";

export class Orders {

    oId !:Number;
    item !:Item;
    customer !: Customer;
    paymentMode !: String;
    orderStatus !: Number;
}
