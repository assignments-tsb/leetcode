//
//  swift_leetcodeApp.swift
//  swift-leetcode
//
//  Created by Lyndon Bibera on 2/26/23.
//

import SwiftUI

@main
struct swift_leetcodeApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
