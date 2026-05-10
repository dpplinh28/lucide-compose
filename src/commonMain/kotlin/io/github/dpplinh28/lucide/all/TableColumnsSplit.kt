package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableColumnsSplit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 15f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 3f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 9f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 15f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                verticalLineToRelative(18f)
            }
}

public val LucideIcons.All.TableColumnsSplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableColumnsSplit: ImageVector
    @Composable get() = TableColumnsSplitDefinition.asImageVector()
