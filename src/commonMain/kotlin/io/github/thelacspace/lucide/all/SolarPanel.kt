package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SolarPanel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.28f, 14f)
                lineToRelative(-4.56f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 22f)
                lineToRelative(-1.558f, -4f)
                horizontalLineTo(4.558f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.245f, 15.04f)
                arcTo(2f, 2f, 0f, false, true, 8f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, .864f, 1.505f)
                lineToRelative(-3.11f, 5.457f)
                arcTo(2f, 2f, 0f, false, true, 16f, 22f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.863f, -1.506f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.66f, 7.66f)
                lineToRelative(1.41f, 1.41f)
            }
}

public val LucideIcons.All.SolarPanelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SolarPanel: ImageVector
    @Composable get() = SolarPanelDefinition.asImageVector()
