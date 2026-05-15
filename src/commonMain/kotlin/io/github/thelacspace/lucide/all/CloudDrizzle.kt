package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudDrizzle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 14.899f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.CloudDrizzleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudDrizzle: ImageVector
    @Composable get() = CloudDrizzleDefinition.asImageVector()
