package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RockingChair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 13f)
                lineToRelative(3.708f, 7.416f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                arcToRelative(15f, 15f, 0f, false, false, 18f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 2f)
                lineToRelative(3.21f, 9.633f)
                arcTo(2f, 2f, 0f, false, false, 8.109f, 13f)
                horizontalLineTo(18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 13f)
                lineToRelative(-3.708f, 7.416f)
            }
}

public val LucideIcons.All.RockingChairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RockingChair: ImageVector
    @Composable get() = RockingChairDefinition.asImageVector()
