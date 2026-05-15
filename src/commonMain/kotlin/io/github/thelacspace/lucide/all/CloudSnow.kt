package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 14.899f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 2.5f, 8.242f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 21f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CloudSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSnow: ImageVector
    @Composable get() = CloudSnowDefinition.asImageVector()
