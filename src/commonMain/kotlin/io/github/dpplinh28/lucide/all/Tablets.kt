package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tablets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.46f, 10.54f)
                lineToRelative(7.08f, -7.08f)
            }
}

public val LucideIcons.All.TabletsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tablets: ImageVector
    @Composable get() = TabletsDefinition.asImageVector()
