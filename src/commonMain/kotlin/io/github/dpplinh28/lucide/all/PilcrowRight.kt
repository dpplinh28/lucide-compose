package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 14f)
                lineToRelative(4f, 4f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 18f)
                lineToRelative(-4f, 4f)
            }
}

public val LucideIcons.All.PilcrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowRight: ImageVector
    @Composable get() = PilcrowRightDefinition.asImageVector()
