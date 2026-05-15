package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignalHigh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineTo(8f)
            }
}

public val LucideIcons.All.SignalHighDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignalHigh: ImageVector
    @Composable get() = SignalHighDefinition.asImageVector()
