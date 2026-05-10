package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Piano") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.5f, 8f)
                curveToRelative(-1.4f, 0f, -2.6f, -.8f, -3.2f, -2f)
                arcTo(6.87f, 6.87f, 0f, false, false, 2f, 9f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-8.5f)
                curveTo(22f, 9.6f, 20.4f, 8f, 18.5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 14f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 14f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 14f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.PianoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Piano: ImageVector
    @Composable get() = PianoDefinition.asImageVector()
