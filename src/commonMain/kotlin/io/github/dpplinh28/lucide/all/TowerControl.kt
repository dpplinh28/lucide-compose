package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowerControl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.2f, 12.27f)
                lineTo(20f, 6f)
                horizontalLineTo(4f)
                lineToRelative(1.8f, 6.27f)
                arcToRelative(1f, 1f, 0f, false, false, .95f, .73f)
                horizontalLineToRelative(10.5f)
                arcToRelative(1f, 1f, 0f, false, false, .96f, -.73f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 13f)
                verticalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 22f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 6f)
                lineToRelative(1f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 6f)
                lineToRelative(-1f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
            }
}

public val LucideIcons.All.TowerControlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowerControl: ImageVector
    @Composable get() = TowerControlDefinition.asImageVector()
