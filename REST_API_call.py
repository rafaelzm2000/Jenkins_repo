#!/usr/bin/python3

import json
import requests
import sys

from veracode_api_signing.plugin_requests import RequestsAuthPluginVeracodeHMAC


def main():
    key_id = "$(VID)"
    key_secret = "$(VKey)"
    hmac = RequestsAuthPluginVeracodeHMAC(api_key_id=key_id, api_key_secret=key_secret)
    url = 'https://api.veracode.com/was/configservice/v1/analyses'
    payload = {"name": "from_Azure", "scans": [{"scan_config_request": {"target_url": {"url": "https://www.hackthissite.org/"}}}],"schedule": {"duration": {"length": 1,"unit": "DAY"},"scheduled": "true","now": "true"}} 
    
    try:
       response = requests.post(url, auth=hmac, json=payload)
       if response.status_code == 201:
           print("Status code: 201. Dynamic Analysis Created Successfully.")    
    except requests.RequestException as e:
        print("Whoops!")
        print(e)
        sys.exit(1)   

if __name__ == "__main__":

   main()
