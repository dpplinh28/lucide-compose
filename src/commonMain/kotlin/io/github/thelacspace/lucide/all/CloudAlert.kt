package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.128f, 16.949f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 8f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 9f)
                horizontalLineToRelative(-1.642f)
            }
}

public val LucideIcons.All.CloudAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudAlert: ImageVector
    @Composable get() = CloudAlertDefinition.asImageVector()
