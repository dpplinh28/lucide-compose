package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Backpack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.BackpackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Backpack: ImageVector
    @Composable get() = BackpackDefinition.asImageVector()
