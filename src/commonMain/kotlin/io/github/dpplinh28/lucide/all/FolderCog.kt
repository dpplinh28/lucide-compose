package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.3f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.98f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.66f, 1.2f)
                arcTo(2f, 2f, 0f, false, false, 12f, 6f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.305f, 19.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 16.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 15.228f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 20.772f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 15.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 21.696f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 16.852f)
                lineToRelative(.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 19.148f)
                lineToRelative(.924f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.FolderCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderCog: ImageVector
    @Composable get() = FolderCogDefinition.asImageVector()
