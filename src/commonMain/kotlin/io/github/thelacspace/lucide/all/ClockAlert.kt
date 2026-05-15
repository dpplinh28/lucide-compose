package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 21f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.25f, 8.2f)
                arcTo(10f, 10f, 0f, true, false, 16f, 21.16f)
            }
}

public val LucideIcons.All.ClockAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockAlert: ImageVector
    @Composable get() = ClockAlertDefinition.asImageVector()
