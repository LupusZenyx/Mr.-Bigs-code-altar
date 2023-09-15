Rails.application.routes.draw do
    get 'usb', to: 'usb#index'
    post 'usb/calculate', to: 'usb#calculate'
  end
  